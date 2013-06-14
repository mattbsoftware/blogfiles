#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------
from google.appengine.api import urlfetch 
from google.appengine.api.labs import taskqueue

proxy=None

class TaskQueueProxy():
    @staticmethod
    def add(url=None, params={}):
        if (proxy == None):
            taskqueue.add(url=url, params=params)

        return proxy.add(url, params)