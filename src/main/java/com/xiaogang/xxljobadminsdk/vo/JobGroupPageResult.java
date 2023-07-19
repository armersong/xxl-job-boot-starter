package com.xiaogang.xxljobadminsdk.vo;

import java.util.List;
import lombok.Data;

import java.io.Serializable;

@Data
public class JobGroupPageResult implements Serializable {

	private int recordsFiltered;

	private List<DataItem> data;

	private int recordsTotal;
}