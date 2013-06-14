#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------


from google.appengine.api import urlfetch 

proxy=None

class UrlFetchProxy():
    def fetch(self, url, deadline=5, headers={}, follow_redirects=False):
        if (proxy == None):
            return urlfetch.fetch(url, deadline=deadline, headers=headers, follow_redirects=follow_redirects)

        return proxy.fetch(url, deadline=deadline, headers=headers, follow_redirects=follow_redirects)