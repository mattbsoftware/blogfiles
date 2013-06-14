#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------


from google.appengine.api import urlfetch 
from UrlFetchProxy_module import *

class UrlFetchingClassUnderTest():
    def execute(self):
       ufp = UrlFetchProxy()
       resp = ufp.fetch("http://example.com/somePage")
       #print resp.content
       
       resp = ufp.fetch("http://example.com/somePage")
       #print resp.content
       