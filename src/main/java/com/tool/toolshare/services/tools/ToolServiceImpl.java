package com.tool.toolshare.services.tools;

import com.tool.toolshare.models.Tool;
import com.tool.toolshare.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolServiceImpl implements ToolService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Tool> getTools() {
        List<Tool> toolsList = jdbcTemplate.query("SELECT * FROM tools", (resultSet, rowNumber) ->
                new Tool(resultSet.getInt("toolId"), resultSet.getString("name"), resultSet.getString("category"), resultSet.getString("description")));
        return toolsList;
    }

    @Override
    public boolean addTool(Tool tool) {
        try {
            jdbcTemplate.update("INSERT INTO tools(name, category, description) VALUES(?, ?, ?)", tool.getName(), tool.getCategory(), tool.getDescription());
        }
        catch (Exception ex) {
            return false;
        }
        return true;
    }
}
