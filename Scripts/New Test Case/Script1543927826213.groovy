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

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_Region_v-filterselect-butt'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/span_East'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_Inspection Type_v-filterse'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/span_EMI Hygiene'))

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_Customer Name_gwt-uid-34'), 'Customer name')

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_Registration Number_gwt-'), 'reg number')

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_ID Number_gwt-uid-42'), 'id number')

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/span_'))

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_Add Location_v-textfield'), 'wr5')

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_Search'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_TEST6 Test ABP Street Test'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_Add Selected Item'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_SLA_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/span_24 Hours'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/div_Fixed Resource_v-filtersel'))

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_Fixed Resource_gwt-uid-1'), 'test')

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/span_Test Inspector'))

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Page_JM Control Centre/input_Fixed Resource_gwt-uid-1'), 'Test Inspector')

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/Refresh'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/Refresh'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/div_2 Days'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/div_Day'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Premises_radio_group_1'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Premises_radio_group_1'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Yes_radio_group_1'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Premises Contravention_g'))

