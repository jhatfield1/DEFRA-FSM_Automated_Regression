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

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/div_Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/div_ABPR13 - Batch Rendering E'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Plant operator or repres'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Name of plant representa'), 'Test')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Plant representative rol'), 'Test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Approximate quantity of'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Maximum practical weekly'), '5')

'Release 24 : FP-836'
WebUI.selectOptionByValue(findTestObject('Object Repository/Complete ABPR13/Page_JClient/select_1 - Continuous or batch'), 
    '7 - To Microbiological', true)

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Critical Control Points'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_(b) What anvil gap is se'), '12')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_How often is it checked_'), '2abc')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/textarea_What happens if the g'), 'test automation')

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_What happens if the gap'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_(b) For how long are the'), '12')

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Are the records legible_'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_concat(If   NO   explain'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/textarea_(e) Explain how instr'), 'test automation')

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_(e) Explain how instrume'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_concat(If   NO   explain_1'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Inspecting Officers Asse'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Are you satisfied with t'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/img_Signature_gwt-Image'))

WebUI.delay(2)

WebUI.click(findTestObject('Complete ABPR13/Spy/Page_JClient/div_Unable To Sign'))

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/div_Batch Rendering Cooker Det'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR13/Page_JClient/div_Create_GFNJNYPCEYB GFNJNYP'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Cooker Identity_gwt-Text'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Make and Model_gwt-TextB'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Capacity of a single loa'), '12')

WebUI.setText(findTestObject('Object Repository/Complete ABPR13/Page_JClient/input_Type of By-product_gwt-T'), 'test automation')

WebUI.click(findTestObject('Complete ABPR13/Spy/Page_JClient/div_Save_Cooker'))

WebUI.delay(2)

WebUI.click(findTestObject('Complete ABPR13/Spy/Page_JClient/div_Save_ABPR13'))

WebUI.delay(2)

