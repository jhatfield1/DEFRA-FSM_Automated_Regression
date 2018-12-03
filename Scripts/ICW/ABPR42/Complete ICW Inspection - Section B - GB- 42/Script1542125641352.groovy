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

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/div_Section B Inspection Detai'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Aircraft movements from'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_GB Approximate Number or'), 
    '60')

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_GB_radio_group_1'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/textarea_Provide a brief descr'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Provide a brief descript'))

WebUI.rightClick(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Provide a brief descript'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/div_Name and company of the pe'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Name and company of the'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_(a) Back trace (complete'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Yes_radio_group_37'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_(b) Forward trace (compl'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/input_Yes_radio_group_39'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 Section B GB/Page_JClient/Page_JClient/div_Save'))

