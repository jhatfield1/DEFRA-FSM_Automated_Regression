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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.delay(30)

WebUI.waitForElementClickable(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'), 
    250)

WebUI.click(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'))

WebUI.waitForElementClickable(findTestObject('JM_8918/Page_JM Control Centre/Page_JM Control Centre/Page_JClient/Refresh'), 
    250)

not_run: WebUI.delay(180)

InspectionRef = WebUI.modifyObjectProperty(findTestObject('Object Repository/FSM1/Reject Inspection/Page_JClient/div_35098'), 
    'text', 'equals', GlobalVariable.temp, true, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

if (WebUI.verifyElementPresent(InspectionRef, 30, FailureHandling.OPTIONAL)) {
    WebUI.delay(3)

    WebUI.click(InspectionRef)
} else {
    WebUI.click(findTestObject('Object Repository/FSM1/Select Inspection/Landing/Page_JClient (1)/2 Days'))

    WebUI.delay(3)

    WebUI.click(InspectionRef)
}

WebUI.click(findTestObject('FSM1/Select Inspection/Page_JClient/div_WITH OPERATIVE'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Reject Inspection/Page_JClient/div_REJECTED'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Availability Change', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Emergency Personal Reason', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Higher priority work - Other', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Higher priority work - Report Case', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Higher priority work - Welfare', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Packing and despatching of samples', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Previous task took longer than planned / Follow up activities required', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Sick', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Tracing activity commenced', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Emergency Personal Reas'), 
    'Availability Change - Traffic Delay', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Technical Issue', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Told to reject by FSM S'), 
    'Technical issue - Told to reject by FSM Support', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Unable to Start Visit', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Biosecurity', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Conflict of interest', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Customer not available - appointment', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Customer not available - unannounced', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Ineligible', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Inspector not Trained / Competent', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - No longer operating', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Refused Access', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Vehicle Breakdown / Accident', true)

'Y'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Weather conditions', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Unable to Complete Visit', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Accident on premisesHS'), 
    'Unable to Complete Visit - Accident on premises', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Accident on premisesHS'), 
    'Unable to Complete Visit - H and S Issue', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Other', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Other'), 'Other', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_Availability ChangeTech'), 
    'Unable to Start Visit', true)

'N'
WebUI.selectOptionByValue(findTestObject('Object Repository/Release27/Rejections/Page_JClient/select_BiosecurityConflict of'), 
    'Unable to Start Visit - Refused Access', true)

WebUI.click(findTestObject('Object Repository/Release27/Rejections/Page_JClient/div_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Reject Inspection/Page_JClient/div_Ok'))

WebUI.delay(30)

