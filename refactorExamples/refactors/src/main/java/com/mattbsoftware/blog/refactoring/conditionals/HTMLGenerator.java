/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals;


/**
 * @author mbrown3
 *
 */
public class HTMLGenerator {
 	//contrived example: there are many better ways to design web pages than generating HTML with Java....
	static final String HREF_TEMPLATE = "<a href='%s'>Comment Link</a>";
	static final String TWITTER_TEMPLATE = "<a class='twitter-tweet' href='https://twitter.com/twitterapi' data-widget-id='%s'>Comment Link</a>";
	static final String FACEBOOK_TEMPLATE = "<a class='facebook-share' href='https://facebook.com/api' data-share-id='%s'>Comment Link</a>";
}
