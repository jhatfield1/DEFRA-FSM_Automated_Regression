<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Fetch_Email</name>
   <tag></tag>
   <elementGuidId>35b37031-73e1-4df8-b996-af09dbb7c07e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.guerrillamail.com/ajax.php?f=fetch_email&amp;lang=en&amp;sid_token=0o023c6smtcm8i1somj12o63o6&amp;email_id=${email_id}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'fetch_email'</defaultValue>
      <description></description>
      <id>48abf676-ce0e-4c80-8661-8e1bd3f7237a</id>
      <masked>false</masked>
      <name>f</name>
   </variables>
   <variables>
      <defaultValue>'en'</defaultValue>
      <description></description>
      <id>04beb434-83ff-4cd3-93e3-f1985213348b</id>
      <masked>false</masked>
      <name>lang</name>
   </variables>
   <variables>
      <defaultValue>'0o023c6smtcm8i1somj12o63o6'</defaultValue>
      <description></description>
      <id>4479f3e5-e07e-436f-a087-7dc60d2c3365</id>
      <masked>false</masked>
      <name>sid_token</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.MailID</defaultValue>
      <description></description>
      <id>175cc479-1e03-4918-9442-44350d797881</id>
      <masked>false</masked>
      <name>email_id</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
