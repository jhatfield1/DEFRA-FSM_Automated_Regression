import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper as JsonSlurper

def responseData1 = WS.sendRequest(findTestObject('Fetch_Email', [('email_id') : GlobalVariable.MailID]))

System.out.println(responseData1.getResponseText())

def jsonSlurper1 = new JsonSlurper()

def res1 = jsonSlurper1.parseText(responseData1.getResponseText())

MailSubject = res1.mail_subject

Attachment = res1.att

AttachmentInfo = res1.att_info

println(MailSubject)

println(Attachment)

println(AttachmentInfo)

println(GlobalVariable.temp)

WS.verifyMatch(Attachment, AttachmentR, true, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(MailSubject, MailSubjectR + GlobalVariable.temp, true, FailureHandling.CONTINUE_ON_FAILURE)

