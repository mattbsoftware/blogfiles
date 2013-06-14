/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;

/**
 * @author mbrown3
 *
 */
public class HREFComment extends BlogCommentSource_V3 {
	static final String TEMPLATE = "<a href='%s'>Comment Link</a>";
	HREFComment() {
		super(TEMPLATE);
	}
}
