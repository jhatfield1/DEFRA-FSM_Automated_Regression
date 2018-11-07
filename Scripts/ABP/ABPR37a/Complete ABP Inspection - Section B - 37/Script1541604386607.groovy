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

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Structure_radio_group_20'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__1'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/span_Yes'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__2'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__3'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__4'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/CombustionPlant'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_(b) Personnel movements'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_(c) Equipment usage_radi'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_(d) A documented cleanin'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_(e) Is the plant clean_r'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_(f) Is pest control plan'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__5'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__6'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__7'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Records_radio_group_35'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_If records have not been'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__8'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__9'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__10'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__11'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__12'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__13'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/input_Not Checked_radio_group__14'))

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyyy')

WebUI.sendKeys(findTestObject('Complete ABPR37 - Section B/Page_JClient/DocumentationDate'), formattedDate)

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/div_Save'))

