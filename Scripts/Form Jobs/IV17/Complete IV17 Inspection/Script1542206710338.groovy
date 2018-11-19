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
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

KeywordLogger log = new KeywordLogger()

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Main Menu_GKH2EKQBMBC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Form Jobs'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_IV17 Import checks'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_WITH OPERATIVE'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_STARTED'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Edit attributes'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Live Ferrets_radio_group'))

WebUI.setText(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_SpeciesCommodity_gwt-Tex'), 'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Region_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Initial details'))

WebUI.setText(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Consignment ID (ITAHC CV'), 'test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Work Schedule_gwt-TextBo'), '123')

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Save'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_DIP Checks'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_IA Is the consignee awar'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_CV Does the ITAHC provid'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_CD Are the destination d'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Not Checked_radio_group__1'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_ID Does the identificati'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Not Checked_radio_group__2'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_PC Have physical checks'))

WebUI.click(findTestObject('FSM1/IV17/Page_JClient/div_Save DIP'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Checked at Location(s)'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Select all applicable lo'))

WebUI.setText(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Number of animals checke'), '10')

WebUI.setText(findTestObject('Object Repository/FSM1/IV17/Page_JClient/input_Number of samples taken_'), '2')

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Checked at Location(s)Date'))

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/IV17/Page_JClient/IV17 Date of Visit'), formattedDate)

WebUI.click(findTestObject('FSM1/IV17/Page_JClient/div_Save Location'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/IV17/Page_JClient/div_Save Complete'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_STARTED'))

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_COMPLETED'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/IV17/Page_JClient/div_Ok'))

WebUI.delay(15)

FormJobReference = WebUI.getText(findTestObject('FSM1/IV17/Page_JClient/Form Job Reference'))

FormJobReference = FormJobReference.replaceAll('Form Job 1 \\(', '')
FormJobReference = FormJobReference.replaceAll('\\)', '')

log.logWarning(FormJobReference)

GlobalVariable.temp1 = FormJobReference

