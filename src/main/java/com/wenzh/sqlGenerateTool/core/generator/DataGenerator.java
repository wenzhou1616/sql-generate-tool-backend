package com.wenzh.sqlGenerateTool.core.generator;

import com.wenzh.sqlGenerateTool.core.schema.TableSchema;

import java.util.List;

/**
 * 数据生成器
 *
 * @author wenzhou
 */
public interface DataGenerator {

    /**
     * 生成
     *
     * @param field 字段信息
     * @param rowNum 行数
     * @return 生成的数据列表
     */
    List<String> doGenerate(TableSchema.Field field, int rowNum);

}
