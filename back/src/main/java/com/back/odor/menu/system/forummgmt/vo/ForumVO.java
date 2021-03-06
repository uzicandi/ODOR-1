package com.back.odor.menu.system.forummgmt.vo;

import com.back.odor.common.utils.vo.CommonVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ForumVO extends CommonVO implements Serializable {

    private static final long serialVersionUID = -3569166259269792508L;

    private Long forumKey;

    private String categoryId;
    private String categoryName;

    private String forumName;

    private String forumTypeCode;
    private String forumTypeName;

    private boolean reviewYn;

    private boolean disabled;

}
