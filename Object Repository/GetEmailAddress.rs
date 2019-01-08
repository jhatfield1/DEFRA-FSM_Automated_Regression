<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GetEmailAddress</name>
   <tag></tag>
   <elementGuidId>0d8dd51b-f94a-441e-95bb-92a9fa844be4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.guerrillamail.com/ajax.php?f=${f}&amp;lang=${lang}&amp;site=${site}&amp;ip=${ip}&amp;agent=${agent}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'get_email_address'</defaultValue>
      <description></description>
      <id>60aabcc8-ba0a-445c-91d4-93dfa2f4130d</id>
      <masked>false</masked>
      <name>f</name>
   </variables>
   <variables>
      <defaultValue>'en'</defaultValue>
      <description></description>
      <id>c8198107-8a8f-4758-a2b4-aa51bc3e4dd3</id>
      <masked>false</masked>
      <name>lang</name>
   </variables>
   <variables>
      <defaultValue>'guerrillamail.com'</defaultValue>
      <description></description>
      <id>13eaff3f-4221-42eb-a1e8-ea3303da2753</id>
      <masked>false</masked>
      <name>site</name>
   </variables>
   <variables>
      <defaultValue>'127.0.0.1'</defaultValue>
      <description></description>
      <id>731aa102-3dcc-4bfa-82e1-93f709663dd2</id>
      <masked>false</masked>
      <name>ip</name>
   </variables>
   <variables>
      <defaultValue>'Mozilla_foo_bar'</defaultValue>
      <description></description>
      <id>04181543-4bb1-49cb-abb0-d701e8a524c9</id>
      <masked>false</masked>
      <name>agent</name>
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

WS.verifyElementPropertyValue(response, 'sid_token', &quot;7q3t7ap9g721qhh3fqrkonlu91&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
