/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;


public class BlogComment_V2{
	String comment;
	BlogCommentSource_V2 source;
	String ref;
	/**
	 * Determine how to link from a comment to it's source
	 * @return the HTML needed to embedd this content in a page
	 */
	public String getLinkHTML(){
		return source.getLinkHTML(ref);
	}
}