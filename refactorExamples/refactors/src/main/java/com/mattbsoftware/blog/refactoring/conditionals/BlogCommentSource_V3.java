/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;

public abstract class BlogCommentSource_V3 {
	protected String template;
	public String comment;
	public String ref;

	BlogCommentSource_V3(String template){
		this.template = template;
	}
	
	public String getLinkHTML(){
		return String.format(template, ref);
	}		
}