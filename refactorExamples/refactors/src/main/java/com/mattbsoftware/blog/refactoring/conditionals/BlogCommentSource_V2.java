/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;

public enum BlogCommentSource_V2 {
	
	HREF(HTMLGenerator.HREF_TEMPLATE),
	FaceBook(HTMLGenerator.FACEBOOK_TEMPLATE),
	Twitter(HTMLGenerator.TWITTER_TEMPLATE);
	final String template;

	private BlogCommentSource_V2(final String template) {
		this.template = template;
	}
	public String getLinkHTML(String ref){
		return String.format(template, ref);
	}		
}