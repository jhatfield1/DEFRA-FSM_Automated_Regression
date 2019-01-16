<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>DeleteEmail</name>
   <tag></tag>
   <elementGuidId>da461328-191c-4ad2-b802-e69e8435c002</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.guerrillamail.com/ajax.php?f=del_email&amp;sid_token=0o023c6smtcm8i1somj12o63o6&amp;email_ids=${email_ids}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'del_email'</defaultValue>
      <description></description>
      <id>3001e2b8-6ea3-47d9-8f54-2bb185be95e0</id>
      <masked>false</masked>
      <name>f</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.MailID</defaultValue>
      <description></description>
      <id>97907eaf-de8d-4478-98d6-3810569460dd</id>
      <masked>false</masked>
      <name>email_ids</name>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
