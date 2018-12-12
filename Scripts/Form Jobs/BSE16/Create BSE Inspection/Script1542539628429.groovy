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

KeywordLogger log = new KeywordLogger('')

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_Main Menu_GKH2EKQBMBC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_Form Jobs'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_BSE16'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_WITH OPERATIVE'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_TRAVELLING'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_TRAVELLING'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_ARRIVED'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_ARRIVED'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_STARTED'))

not_run: mydate = new Date()

not_run: formattedDate = mydate.format('MM/dd/yyy')

not_run: WebUI.sendKeys(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/IV17 Date of Visit'), formattedDate)

