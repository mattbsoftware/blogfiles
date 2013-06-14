/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;

/**
 * @author mbrown3
 *
 */
public class TwitterComment extends BlogCommentSource_V3 {
	static final String TEMPLATE = "<a class='twitter-tweet' href='https://twitter.com/twitterapi' data-widget-id='%s'>Comment Link</a>";
	TwitterComment() {
		super(TEMPLATE);
	}
}
