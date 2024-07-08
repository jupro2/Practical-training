<template>
  <div class="notice">
    <el-card>
      <h2>系统公告</h2>
      <el-table :data="notices" style="width: 100%">
        <el-table-column prop="title" label="标题" width="180"></el-table-column>
        <el-table-column prop="content" label="内容"></el-table-column>
        <el-table-column prop="date" label="日期" width="150"></el-table-column>
      </el-table>
      <el-button type="primary" @click="addNotice">添加公告</el-button>
    </el-card>
    <el-dialog :visible.sync="dialogVisible" title="添加公告">
      <el-form :model="newNotice">
        <el-form-item label="标题">
          <el-input v-model="newNotice.title"></el-input>
        </el-form-item>
        <el-form-item label="内容">
          <el-input type="textarea" v-model="newNotice.content"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="saveNotice">保存</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      notices: [],
      dialogVisible: false,
      newNotice: {
        title: '',
        content: '',
        date: new Date().toLocaleString()
      }
    };
  },
  methods: {
    addNotice() {
      this.dialogVisible = true;
    },
    saveNotice() {
      this.notices.push({ ...this.newNotice, date: new Date().toLocaleString() });
      this.dialogVisible = false;
      this.newNotice = { title: '', content: '', date: '' };
    }
  }
};
</script>

<style scoped>
.notice {
  padding: 20px;
}
</style>
