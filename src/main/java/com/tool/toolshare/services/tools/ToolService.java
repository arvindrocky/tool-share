package com.tool.toolshare.services.tools;

import com.tool.toolshare.models.Tool;

import java.util.List;

public interface ToolService {
    public List<Tool> getTools();
    public boolean addTool(Tool tool);
}
