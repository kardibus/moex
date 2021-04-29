package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("metadata")
public class MetadataCursorSecurities {

    @XStreamAlias("columns")
    private ColumnsCursorSecurities columnsCursorSecurities;
}
