/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;

public class BlogComment{
	String comment;
	BlogCommentSource source;
	String ref;
	/**
	 * Determine how to link from a comment to it's source
	 * @return the HTML needed to embedd this content in a page
	 */
	public String getLinkHTML(){
		switch (source) {
			case HREF:
				return String.format(HTMLGenerator.HREF_TEMPLATE, ref);
			case FaceBook:
				return String.format(HTMLGenerator.FACEBOOK_TEMPLATE, ref);	
			case Twitter:
				return String.format(HTMLGenerator.TWITTER_TEMPLATE, ref);
			default:
				return null;
		}		
	}
}