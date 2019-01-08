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
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.testobject.ConditionType as ConditionType

//WS.sendRequest(findTestObject('Object Repository/SetEmailUser', [('f') : 'set_email_user', ('email_user') : 'hatfield', ('site') : 'guerrillamail.com'
//         , ('lang') : 'en', ('sid_token') : '0o023c6smtcm8i1somj12o63o6']))
WebUI.delay(240)

def responseData = WS.sendRequest(findTestObject('CheckEmail', [('f') : 'check_email', ('seq') : '0', ('sid_token') : '0o023c6smtcm8i1somj12o63o6']))

System.out.println(responseData.getResponseText())

def jsonSlurper = new JsonSlurper()

def res = jsonSlurper.parseText(responseData.getResponseText())

GlobalVariable.MailID = (res.list.mail_id[1])

println(GlobalVariable.MailID)

