/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tedao;

import temodel.tuser;

/**
 *
 * @author windows
 */
public interface tuserdao {
    public tuser getTeacherbyid(String id);
    public boolean addTeacher(tuser t);
    public boolean updateTeacher(tuser t);
    public boolean deleteTeacher(tuser t);
}
