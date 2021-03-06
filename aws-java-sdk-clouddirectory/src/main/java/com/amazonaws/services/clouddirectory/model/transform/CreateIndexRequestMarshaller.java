/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateIndexRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateIndexRequestMarshaller {

    private static final MarshallingInfo<String> DIRECTORYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-data-partition").build();
    private static final MarshallingInfo<List> ORDEREDINDEXEDATTRIBUTELIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrderedIndexedAttributeList").build();
    private static final MarshallingInfo<Boolean> ISUNIQUE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IsUnique").build();
    private static final MarshallingInfo<StructuredPojo> PARENTREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentReference").build();
    private static final MarshallingInfo<String> LINKNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LinkName").build();

    private static final CreateIndexRequestMarshaller instance = new CreateIndexRequestMarshaller();

    public static CreateIndexRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateIndexRequest createIndexRequest, ProtocolMarshaller protocolMarshaller) {

        if (createIndexRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createIndexRequest.getDirectoryArn(), DIRECTORYARN_BINDING);
            protocolMarshaller.marshall(createIndexRequest.getOrderedIndexedAttributeList(), ORDEREDINDEXEDATTRIBUTELIST_BINDING);
            protocolMarshaller.marshall(createIndexRequest.getIsUnique(), ISUNIQUE_BINDING);
            protocolMarshaller.marshall(createIndexRequest.getParentReference(), PARENTREFERENCE_BINDING);
            protocolMarshaller.marshall(createIndexRequest.getLinkName(), LINKNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
