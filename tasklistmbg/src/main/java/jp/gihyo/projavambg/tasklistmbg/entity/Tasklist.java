package jp.gihyo.projavambg.tasklistmbg.entity;

import lombok.Data;

@Data
public class Tasklist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TASKLIST.ID
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TASKLIST.TASK
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    private String task;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TASKLIST.DEADLINE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    private String deadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TASKLIST.DONE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    private Boolean done;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TASKLIST.ID
     *
     * @return the value of TASKLIST.ID
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TASKLIST.ID
     *
     * @param id the value for TASKLIST.ID
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TASKLIST.TASK
     *
     * @return the value of TASKLIST.TASK
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public String getTask() {
        return task;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TASKLIST.TASK
     *
     * @param task the value for TASKLIST.TASK
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TASKLIST.DEADLINE
     *
     * @return the value of TASKLIST.DEADLINE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public String getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TASKLIST.DEADLINE
     *
     * @param deadline the value for TASKLIST.DEADLINE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TASKLIST.DONE
     *
     * @return the value of TASKLIST.DONE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public Boolean getDone() {
        return done;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TASKLIST.DONE
     *
     * @param done the value for TASKLIST.DONE
     *
     * @mbg.generated Fri May 26 13:44:06 JST 2023
     */
    public void setDone(Boolean done) {
        this.done = done;
    }
}