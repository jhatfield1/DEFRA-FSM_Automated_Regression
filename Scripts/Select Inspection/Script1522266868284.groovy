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

WebUI.delay(30)

WebUI.waitForElementClickable(findTestObject('FSM1/Select Inspection/Landing/Refresh'), 250)

WebUI.click(findTestObject('FSM1/Select Inspection/Landing/Refresh'))

WebUI.waitForElementClickable(findTestObject('FSM1/Select Inspection/Landing/Refresh'), 250)

not_run: WebUI.delay(20)

InspectionRef = WebUI.modifyObjectProperty(findTestObject('FSM1/Select Inspection/Landing/Page_JClient/div_35098'), 'text', 
    'equals', GlobalVariable.temp, true, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

if (WebUI.verifyElementPresent(InspectionRef, 30, FailureHandling.OPTIONAL)) {
	WebUI.delay(3)
	WebUI.click(InspectionRef)
}
else {
	WebUI.click(findTestObject('Object Repository/FSM1/Select Inspection/Landing/Page_JClient (1)/2 Days'))
	WebUI.delay(3)
	WebUI.click(InspectionRef)
}


WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_WITH OPERATIVE'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_TRAVELLING'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_TRAVELLING'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_ARRIVED'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_ARRIVED'))

WebUI.delay(4)

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_STARTED'))

WebUI.delay(2)

