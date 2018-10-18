<template>
  <div>
    <h1>{{user.name}} : {{user.phone}}</h1>
  </div>
</template>

<script>
export default {
  name: 'DetailUser',
  data () {
    return {
      user: {}
    }
  },
  created () {
    var id = this.$route.params.id
    this.$http.get(`/api/users/${id}`).then(resp => {
      this.user = resp.data.response
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
