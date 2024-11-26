<template>
    <div>
        <el-container>
            <el-header style="font-size: 40px;background-color: rgb(200, 240, 240); border: 1px;">智能辅助系统</el-header>
            <el-container>
                <el-aside width = 230px style="border: 1px solid #eee">
                    <el-menu :default-openeds="['1', '2']"><!-- 目录 -->
                        <el-submenu index="1"> <!-- 目录1 -->
                            <template slot="title">
                                <i class="el-icon-message"></i>系统信息管理
                            </template>
                            <el-menu-item index="1-1">
                                <router-link to="/dept">部门管理</router-link>
                            </el-menu-item>
                            <el-menu-item index="1-2">
                                <router-link to="/emp">员工管理</router-link>
                            </el-menu-item>
                        </el-submenu>
                        <el-submenu index="2"> <!-- 目录2 -->
                            <template slot="title">
                                <i class="el-icon-setting"></i>班级学员管理
                            </template>
                            <el-menu-item index="2-1">班级管理</el-menu-item>
                            <el-menu-item index="2-2">学员管理</el-menu-item>
                        </el-submenu>
                    </el-menu>
                </el-aside>


                <el-main>
                    <el-form :inline="true" :model="searchForm" class="demo-form-inline">
                        <el-form-item label="姓名">
                            <el-input v-model="searchForm.name" placeholder="姓名"></el-input>
                        </el-form-item>

                        <el-form-item label="性别">
                            <el-select v-model="searchForm.gender" placeholder="性别">
                                <el-option label="男" value="1"></el-option>
                                <el-option label="女" value="2"></el-option>
                            </el-select>
                        </el-form-item>


                        <el-date-picker v-model="searchForm.entrydate" type="daterange" range-separator="至"
                            start-placeholder="开始日期" end-placeholder="结束日期">
                        </el-date-picker>


                        <el-form-item>
                            <el-button type="primary" @click="onSubmit">查询</el-button>
                        </el-form-item>

                    </el-form>


                    <el-table :data="tableData" border>
                        <el-table-column prop="name" label="姓名" width="180"></el-table-column>
                        <el-table-column label="图像" width="180">
                            <template slot-scope="scope">
                                <img v-bind:src="scope.row.image" width="70px">
                            </template>
                        </el-table-column>
                        <el-table-column prop="gender" label="性别" width="140">
                            <template slot-scope="scope">
                                {{ scope.row.gender == 1 ? '男':'女' }}
                            </template>
                        </el-table-column>
                        <el-table-column prop="job" label="职位" width="140"></el-table-column>
                        <el-table-column prop="entrydate" label="入职日期" width="180"></el-table-column>
                        <el-table-column prop="updatetime" label="最后操作时间" width="230"></el-table-column>
                        <el-table-column label="操作">
                            <el-button type="primary" size="mini">编辑</el-button>
                            <el-button type="danger" size="mini">删除</el-button>
                        </el-table-column>
                    </el-table>

                    <!-- 分页组件(下一页) -->
                    <el-pagination background layout="sizes, prev, pager, next, jumper" @size-change="handleSizeChange"
                        @current-change="handleCurrentChange" :total="1000"></el-pagination>

                </el-main>
            </el-container>
        </el-container>
    </div>
</template>


<script>
import axios from 'axios';
export default {
    data() {
        return {
            tableData: [],
            searchForm: {
                name: "",
                gender: "",
                entrydate: []
            }
        }
    },
    methods: {
        onSubmit() {
            alert(JSON.stringify(this.searchForm))
        },
        handleSizeChange: function (val) {
            alert("每页大小变化为：" + val);
        },
        handleCurrentChange: function (val) {
            alert("当前页数变化为：" + val);
        }
    },
    //钩子方法
    mounted(){
        axios.get("https://mock.apifox.cn/m1/3128855-0-default/emp/list").then((resule) =>{
            this.tableData = resule.data.data;
        })
    }
}
</script>



<style></style>