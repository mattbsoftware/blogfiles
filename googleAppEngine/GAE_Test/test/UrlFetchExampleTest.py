#---------------------------------------------------------------------------
# Authored by Matt Brown in 2009.  This code is public domain and comes with
#  no waranty.  Use and improve at you own will.  Be nice and include my name 
#  in future versions, even though it's not required.
#---------------------------------------------------------------------------

from google.appengine.api import urlfetch 
import os
import unittest
import UrlFetchProxy_module
from UrlFetchSample import *

import logging

class TestResponseObj():
    headers = {"set-cookie": "whatever=stuff; a=bPLUSc"}
    content = None
    
class UrlFetchSampleFiles():
    def getTestPull(self, fname):
        directory = os.path.dirname(__file__)
        path = os.path.join(directory,os.path.join(fname))

        file = open(path)
        doc = file.read()
        file.close()
        return doc
    
    hits = []
    fetchCount = 0
    def fetch(self, url, deadline=5, headers={}, follow_redirects=False):
        self.fetchCount = self.fetchCount + 1
        doc = self.hits.pop()
        resp = TestResponseObj()
        resp.content = doc
        return resp    
    
    def __init__(self): 
        self.hits = [self.getTestPull("sample-3.html"), self.getTestPull("sample-2.html"), self.getTestPull("sample-1.html")]
        

class UrlFetchSampleTest(unittest.TestCase):
  def test1(self):
      proxy = UrlFetchSampleFiles()
      UrlFetchProxy_module.proxy = proxy
      c = UrlFetchingClassUnderTest()
      c.execute()
      self.assertEqual(2, proxy.fetchCount)
