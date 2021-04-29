package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("metadata")
public class MetadataCursor {

    @XStreamAlias("columns")
    private ColumnsCursor columnsCursor;
}
