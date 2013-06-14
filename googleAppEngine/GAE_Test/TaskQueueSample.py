#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------

import os
import cgi
import datetime
import wsgiref.handlers
from google.appengine.api.labs import taskqueue
from google.appengine.ext import db
from google.appengine.ext import webapp
from google.appengine.ext.webapp import template

import sys
import logging
from datetime import *
import logging
from TaskQueueProxy_module import TaskQueueProxy
from UrlFetchProxy_module import *

class CollectDataTaskStarter(webapp.RequestHandler):
    def get(self):
        self.start(False)
                
    def start(self):
        logging.info("TaskStarter:")
        cookie = "acookie"

        # Add the task to the default queue.
        TaskQueueProxy.add(url='/tasks/worker', params={'mcookie': cookie})

class CollectDataTaskWorker(webapp.RequestHandler):
  def post(self): 
      cookie = self.request.get('mcookie')
      logging.info("TaskWorker: "+ str(cookie))
      
      ufp = UrlFetchProxy()
      u = ufp.fetch('http://example.com/some/stuff')
      
      params = {'mcookie': cookie}
      if (not u.content.find("this is sample3") >= 0): 
          # Add the task to the default queue.
          TaskQueueProxy.add(url='/tasks/worker', params=params)
          #Code here will not execute under test            
 
