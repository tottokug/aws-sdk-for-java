/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Describe Communications Result JSON Unmarshaller
 */
public class DescribeCommunicationsResultJsonUnmarshaller implements Unmarshaller<DescribeCommunicationsResult, JsonUnmarshallerContext> {

    

    public DescribeCommunicationsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCommunicationsResult describeCommunicationsResult = new DescribeCommunicationsResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("communications", targetDepth)) {
                    describeCommunicationsResult.setCommunications(new ListUnmarshaller<Communication>(CommunicationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    describeCommunicationsResult.setNextToken(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return describeCommunicationsResult;
    }

    private static DescribeCommunicationsResultJsonUnmarshaller instance;
    public static DescribeCommunicationsResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeCommunicationsResultJsonUnmarshaller();
        return instance;
    }
}
    