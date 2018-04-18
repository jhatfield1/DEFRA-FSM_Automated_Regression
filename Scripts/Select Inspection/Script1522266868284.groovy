import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.delay(10)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_5 Days'))

WebUI.click(findTestObject('FSM1/Select Inspection/Landing/Refresh'))

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/InspectionID'))

not_run: WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_Job TypeABPR01A - Composti'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_WITH OPERATIVE'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_STARTED'))

