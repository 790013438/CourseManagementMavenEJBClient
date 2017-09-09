package snippets.ejb;

import java.util.List;

import javax.ejb.Remote;

import snippets.dto.CourseDTO;

@Remote
public interface CourseBeanRemote {

    public List<CoursDTO> getCourses();
}
