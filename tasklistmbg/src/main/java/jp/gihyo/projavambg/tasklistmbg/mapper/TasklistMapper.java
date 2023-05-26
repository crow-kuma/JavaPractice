package jp.gihyo.projavambg.tasklistmbg.mapper;

import java.util.List;
import jp.gihyo.projavambg.tasklistmbg.entity.Tasklist;
import jp.gihyo.projavambg.tasklistmbg.entity.TasklistExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TasklistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    long countByExample(TasklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int deleteByExample(TasklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int insert(Tasklist row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int insertSelective(Tasklist row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    List<Tasklist> selectByExample(TasklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    Tasklist selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int updateByExampleSelective(@Param("row") Tasklist row, @Param("example") TasklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int updateByExample(@Param("row") Tasklist row, @Param("example") TasklistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int updateByPrimaryKeySelective(Tasklist row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TASKLIST
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    int updateByPrimaryKey(Tasklist row);
}