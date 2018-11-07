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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Planning Permission_radi'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Ground Water Protection_'))

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/BurialDensity'), 'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_What was the outcome_rad'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group__1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group__2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group__3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group__4'))

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/DeadPets'), 'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_concat(9. Is there any'))

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/GuidanceDischarge'), 'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Protection against carni'))

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/textarea_What was the outcome_'), 
    'test automation')

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/WaterControlDischarge'), 'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Records_radio_group_29'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_If records have not been'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/input_Not Checked_radio_group__5'))

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABP29/Page_JClient/Page_JClient/ApprovalDate'), formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABP29/Page_JClient/div_Save'))
