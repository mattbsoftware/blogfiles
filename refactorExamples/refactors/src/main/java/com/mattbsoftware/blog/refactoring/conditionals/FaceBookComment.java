/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;


public class FaceBookComment extends BlogCommentSource_V3 {
	static final String TEMPLATE = "<a class='facebook-share' href='https://facebook.com/api' data-share-id='%s'>Comment Link</a>";

	FaceBookComment() {
		super(TEMPLATE);
	}
}
