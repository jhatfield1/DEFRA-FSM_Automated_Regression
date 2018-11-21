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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger()

WebUI.click(findTestObject('FSM1/Select Inspection/Landing/Page_JClient (2)/div_Edit attributes'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Mr Automation'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Business TypeAUCTION MARKE'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Job TypeEMI InspectionJob'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '99/888/7777', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.check(findTestObject('Object Repository/FSM1/Select Inspection/Landing/Page_JClient (5)/UpdateDetails'))

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'automation@eggs.com')

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Automation Street\n')

not_run: WebUI.sendKeys(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), Keys.chord(
        Keys.ENTER))

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Automation Street\nAutomation ')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient/TradingName'), 'Egg Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (6)/EggThroughput'))

WebUI.delay(2)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/EggThroughput/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), 
    '100')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerRegularFreeRange'), '90')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerRegularBarn'), '80')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerRegularCageEnriched'), 
    '70')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerImporterOrganic'), '60')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerImporterFreeRange'), 
    '70')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerImporterBarn'), '50')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerImporterCageEnriched'), 
    '50')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/ThroughputChangedUK'), '11')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/ThroughputChangedImported'), 
    '12')

WebUI.selectOptionByValue(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/select_Compliance (Schedule  A'), 'COMPLIANCE', 
    true)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/WholeSalerRegularOrganic'), 
    '9')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/WholeSalerRegularFreeRange'), 
    '8')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/WholeSalerRegularBarn'), '7')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (1)/div_Signatures  Remarks'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (4)/InspectorSignature1'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (1)/div_My JobsLast updated 1518Da'))

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (3)/RecipientSignature'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (1)/div_My JobsLast updated 1518Da'))

WebUI.delay(5)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (6)/RecipientName2'), 'Test Automation', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (8)/label_Business Owner'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Signatures/Page_JClient (10)/Save'))

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (7)/div_Save_edit_details'))

WebUI.delay(2)

