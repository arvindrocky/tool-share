package com.tool.toolshare.models;

public class Tool {
    private int toolId;
    private String name;
    private String category;
    private String description;

    public Tool(int toolId, String name, String category, String description) {
        this.toolId = toolId;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public int getToolId() {
        return toolId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
