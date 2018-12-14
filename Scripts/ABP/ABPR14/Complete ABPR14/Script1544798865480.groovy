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

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/div_Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/div_ABPR14 - Continuous Render'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Plant operator or repres'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Name of plant representa'), 'Test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Plant representative rol'), 'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Complete ABPR14/Page_JClient/select_1 - Continuous or batch'), 
    '7 - To Microbiological', true)

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Approximate quantity of'), '12')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Maximum practical weekly'), '12')

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Critical Control Points'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_Please comment_gwt-Te'), 'Test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_(b) What anvil gap is se'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_How often is it checked_'), '2weeks')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_What happens if the g'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_What happens if the gap'), 'test')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_What happens if the f'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_What happens if the feed'), 'test')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_What happens if the f'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_What happens if the fat'), '2 weeks')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_What happens if the p'), 'test automation')

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_What happens if the proc'))

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_concat(If   NO   explain'))

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Yes_radio_group_12'))

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Inspecting Officers Asse'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_Please comment_gwt-Te'), 'test automation')

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Are you satisfied with t'))

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/textarea_Please comment_gwt-Te'), 'Test automation')

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/img_Signature_gwt-Image'))

WebUI.click(findTestObject('Complete ABPR14/Spy/Page_JClient/div_Unable To Sign_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/div_Continuous Batch Rendering'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/div_Create_GFNJNYPCEYB GFNJNYP'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Cooker Identity_gwt-Text'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Make and Model_gwt-TextB'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Maximum capacity tonnesh'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Method (See Annex V Chap'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Type of By-product_gwt-T'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Raw material feed rate a'), 'test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Complete ABPR14/Page_JClient/select_Automatic weighing appa'), 
    'Automatic weighing apparatus', true)

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_How is feed rate control'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Raw material feed rate a'), 'test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/Complete ABPR14/Page_JClient/select_Automatic weighing or v'), 
    'Automatic weighing/vol equip', true)

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_How is feed rate control'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Position of thermocouple'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_How is the temperature o'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Raw material feed rate ('), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Fat recycle rate (at tim'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time test started_gwt-Te'), '10:00')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time test finished_gwt-T'), '11:00')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_(a) Minimum residence ti'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_(b) Minimum residence ti'), '12')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Laboratory where samples'), 'test automation')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time above 100C (mins)_g'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time above 110C (mins)_g'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time above 120C (mins)_g'), '10')

WebUI.setText(findTestObject('Object Repository/Complete ABPR14/Page_JClient/input_Time above 130C (mins)_g'), '10')

WebUI.click(findTestObject('Object Repository/Complete ABPR14/Page_JClient/img_Signature_gwt-Image'))

WebUI.click(findTestObject('Complete ABPR14/Spy/Page_JClient/div_Unable To Sign'))

WebUI.click(findTestObject('Complete ABPR14/Spy/Page_JClient/div_Save_cooker'))

WebUI.delay(2)

WebUI.click(findTestObject('Complete ABPR14/Spy/Page_JClient/div_Save_ABPR14'))

WebUI.delay(2)

