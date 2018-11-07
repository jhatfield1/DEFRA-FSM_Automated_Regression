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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kirona-def-6.kirona.com/jmprep/jclient/jclient.html')

WebUI.setText(findTestObject('FSM1/Launch Application/Page_JClient/input_gwt-TextBox GKH2EKQBMDB'), 'KIR1')

WebUI.sendKeys(findTestObject('FSM1/Launch Application/Page_JClient/input_gwt-TextBox GKH2EKQBMDB'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('FSM1/Launch Application/Page_JClient/div_Configure App'))

WebUI.setText(findTestObject('FSM1/Launch Application/Page_JClient/input_gwt-TextBox GKH2EKQBNHC'), findTestData('Pre Production/UandP').getValue(
        3, 1))

WebUI.setText(findTestObject('FSM1/Launch Application/Page_JClient/input_gwt-PasswordTextBox GKH2'), findTestData('Pre Production/UandP').getValue(
        4, 1))

WebUI.click(findTestObject('FSM1/Launch Application/Page_JClient/div_Sign In'))

WebUI.delay(15)

