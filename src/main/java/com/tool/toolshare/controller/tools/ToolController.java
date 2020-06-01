package com.tool.toolshare.controller.tools;

import com.tool.toolshare.models.Tool;
import com.tool.toolshare.services.tools.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tool-share")
public class ToolController {
    @Autowired
    ToolService toolService;

    @GetMapping("/tools")
    public List<Tool> getTools() {
        return toolService.getTools();
    }

    @PostMapping("/tools")
    public boolean addTool(@RequestBody Tool tool) {
        return toolService.addTool(tool);
    }
}
