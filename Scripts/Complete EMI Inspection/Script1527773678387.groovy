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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.verifyElementPresent(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Mr Automation'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_111'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_222'), 0)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Business TypeAUCTION MARKE'))

not_run: WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Job TypeEMI InspectionJob'))

WebUI.click(findTestObject('FSM1/Select Inspection/Landing/Page_JClient (2)/div_Edit attributes'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '99/888/7777')

WebUI.delay(3)




not_run: WebUI.check(findTestObject('Object Repository/FSM1/Select Inspection/Landing/Page_JClient (5)/UpdateDetails'))

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'automation@eggs.com')

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Automation Street\n')

not_run: WebUI.sendKeys(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), Keys.chord(
        Keys.ENTER))

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Automation Street\nAutomation ')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient/TradingName'), 'Egg Automation')

WebUI.check(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (4)/HaveEggThroughputChanged'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Edit Job Details/Page_JClient (2)/PackerRegularOrganic'), '100')

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

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_224'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/img_gwt-Image'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_My JobsLast updated 1458Da'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/img_gwt-Image'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_My JobsLast updated 1458Da'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'Auto')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), 'Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_2'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Save'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Save'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_225'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_226'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_GKH2EKQBDXB GKH2EKQBIXB GK'))

WebUI.selectOptionByValue(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/select_ADLAORAPLAQYASDCATCCICS'), 'CSD', 
    true)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '25')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Test Category  Compliance'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_3'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-uid-229'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_4'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_1 - Low Risk (Candling b'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_5'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_3 - Medium Risk (Poor qu'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_6'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_3 - Medium Risk (Consecu'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_7'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_2 - Low to Medium Risk ('))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_8'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_5 - High Risk (Disregard'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_9'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_5 - High Risk (Disregard_1'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_10'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_1 - Low Risk (no sizewei'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_11'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_3 - Medium Risk (Prod re'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Follow Up inspection requi'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_12'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Save'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_225'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_COMPLETED'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Organic Number'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '100')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_13'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '99')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/label_Yes'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_14'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '98')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/span_Yes'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_15'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_227'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-TextBox GKH2EKQBOHC (1)'), '97')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_16'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_16'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_17'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_18'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_19'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_20'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Tes')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_21'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_22'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '36')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_23'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/span_No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_24'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_25'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_26'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_27'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_28'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/input_radio_group_29'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/textarea_gwt-TextArea GKH2EKQB'), 'Test comments')

WebUI.selectOptionByValue(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/select_Yes'), 'COMPLETED', true)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Page_JClient/div_Save'))

WebUI.closeBrowser()

