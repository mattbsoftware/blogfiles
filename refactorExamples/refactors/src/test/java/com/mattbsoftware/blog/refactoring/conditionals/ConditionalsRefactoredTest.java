package com.mattbsoftware.blog.refactoring.conditionals;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Matt Brown
 *
 */
public class ConditionalsRefactoredTest {
	private static final String LINK_RESULT = "<a href='ref'>Comment Link</a>";
	@Test
	public void testV1(){
		BlogComment bc = new BlogComment();
		bc.comment = "stuff";
		bc.ref = "ref";
		bc.source = BlogCommentSource.HREF;
		assertThat(bc.getLinkHTML(), is(LINK_RESULT));
	}

	
	@Test
	public void testV2(){
		BlogComment_V2 bc = new BlogComment_V2();
		bc.comment = "stuff";
		bc.ref = "ref";
		bc.source = BlogCommentSource_V2.HREF;
		assertThat(bc.getLinkHTML(), is(LINK_RESULT));
	}
	@Test
	public void testV3(){
		BlogCommentSource_V3 bc = new HREFComment();
		bc.comment = "stuff";
		bc.ref = "ref";
		assertThat(bc.getLinkHTML(), is(LINK_RESULT));
	}	
}