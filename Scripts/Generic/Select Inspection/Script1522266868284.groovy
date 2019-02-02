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

WebUI.delay(25)

WebUI.waitForElementClickable(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'), 
    250)

WebUI.click(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'))

WebUI.waitForElementClickable(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'), 
    250)

InspectionRef = WebUI.modifyObjectProperty(findTestObject('FSM1/Select Inspection/Landing/Page_JClient/div_35098'), 'text', 
    'equals', GlobalVariable.temp, true, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

if (WebUI.verifyElementPresent(InspectionRef, 10, FailureHandling.OPTIONAL)) {
    WebUI.delay(3)

    WebUI.click(InspectionRef)
} else {
    WebUI.click(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/div_2 Days'))

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

