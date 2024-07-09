<template>
  <div class="deptList">
    <Table ref="tab" :util="{
      httpUrl:'/physician',
      params:'', //请求地址
      dname:'科名//did',
      pname:'医师名',
      poccname:' 医生职称',
    }" curpage="1"
           :headhide='123'>
      <el-button type="primary" @click="gua()">挂号</el-button>
    </Table>
  </div>
</template>

<script lang="js">
export default {
  name: "deptList",
  components: {},
  methods: {
    gua(){
      let uid = localStorage.getItem('uid')
      console.log(uid)
      let row = this.$refs.tab.checkRowCheck()
      if (row) {
        console.log(row)
        // 向数据库中添加挂科室信息
        let params = {
          uid: uid,
          did: row.id,
        }
        this.$http.post('/departmentOrder', params)
            .then(res => {
              alert("挂号成功" + res)
            })
      }
    }
  }
}
</script>

<style scoped lang="css">
.deptList {

}
</style>
