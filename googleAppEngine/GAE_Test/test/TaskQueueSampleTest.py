#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------
import unittest
import logging
from google.appengine.ext import db

import urllib

from TaskQueueSample import *
import datetime
import TaskQueueProxy_module

import os;
from UrlFetchExampleTest import *

class TaskQueueProxy():
    def add(self, url, params):
        #emulate the task queue
        cdw = CollectDataTaskWorker()
        cdw.request = {'mcookie':"Unit Test"}
        cdw.post()
    
class TestTaskQueueTask(unittest.TestCase):
            
    def testTask(self):
        cds = CollectDataTaskStarter()
        TaskQueueProxy_module.proxy = TaskQueueProxy()
        uproxy = UrlFetchSampleFiles()
        UrlFetchProxy_module.proxy = uproxy
        cds.start()
        self.assertEqual(uproxy.fetchCount, 3)
        