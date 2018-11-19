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

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_Vessel movements from (t'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_GB Approximate Number or'), 
    '10')

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_MCA waste management pla'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_NA_radio_group_2'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/textarea_NA_gwt-TextArea GKH2E'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_NA_radio_group_3'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_GB and EU_radio_group_4'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_If yes ABPR40 forms are'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_if no all vessels must b'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_Explain briefly_radio_gr'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_(a) Back trace (complete'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_Yes_radio_group_39'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_Yes_radio_group_39'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_(b) Forward trace (compl'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/input_Yes_radio_group_41'))

WebUI.click(findTestObject('Object Repository/FSM1/ABP191 Section B - GB/Page_JClient/div_Save'))

