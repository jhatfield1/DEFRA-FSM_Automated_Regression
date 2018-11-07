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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Structure_radio_group_19'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details of fi'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/textarea_Operations_gwt-TextAr'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Operations_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details (e.g.'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If they are not listed a'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Give details_radio_group'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_5'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/textarea_If YES give details a'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Records_radio_group_32'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If records have not been'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_6'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_7'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_8'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_If NO give details and a_9'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_(a) Back trace (complete'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Yes_radio_group_39'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_(b) Forward trace (compl'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_Yes_radio_group_41'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/input_How many tracings are to'), 
    '2')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR25a/Page_JClient/div_Save'))

